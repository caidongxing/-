package com.hy.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.po.User;
import com.hy.service.UserService;
import com.hy.util.EncryptUtil;

@Controller
@RequestMapping("loginController")
public class LoginController extends BaseController {

	@Autowired
	private UserService userService;
	
	public static final char[] CHARS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9','a','b','c','d','e','f','G','H','I','J','K','L' };
	public static Random random = new Random();
	// 获取随机数
	public static String getRandomString() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			buffer.append(CHARS[random.nextInt(CHARS.length)]);
		}
		return buffer.toString();
	}

	// 设置颜色
	public static Color getRandomColor() {
		return new Color(random.nextInt(255), random.nextInt(255),
				random.nextInt(255));
	}

	public static Color getReverseColor(Color c) {
		return new Color(255 - c.getRed(), 255 - c.getGreen(),
				255 - c.getBlue());
	}
	//图形验证码
	@RequestMapping("verificationCode")
	public void VerificationCode(){
		
		String strCode = getRandomString();
		request.getSession(true).setAttribute("strCode", strCode);
		System.out.println("验证码的值：" + strCode);

		// 设置长度和宽度
		int width = 120;
		int height = 30;

		Color color = getRandomColor();
		Color reverse = getReverseColor(color);

		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		g.setColor(color);
		g.fillRect(0, 0, width, height);
		g.setColor(reverse);
		//设置显示位置
		g.drawString(strCode, 20, 25);
		for (int i = 0, n = random.nextInt(100); i < n; i++) {
			g.drawRect(random.nextInt(width), random.nextInt(height), 1, 1);
		}

        g.dispose(); 
        try {
			ImageIO.write(bi, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@RequestMapping("login")
	public String login(String username,String password, String code){
		String strCode = request.getSession().getAttribute("strCode").toString();
		try {
			if(!code.equals(strCode)){
				throw new UnsupportedOperationException("验证码错误！");
			}else{
				try {
					if (StringUtils.isBlank(username)) {
						throw new UnsupportedOperationException("帐号不能为空！");
					}
					if (StringUtils.isBlank(password)) {
						throw new UnsupportedOperationException("密码不能为空！");
					}
					//密码MD5加密
					String pw = EncryptUtil.MD5(password);
					User userPo = userService.login(username, pw);
					
					if (userPo == null) {
						throw new UnsupportedOperationException("该帐号没注册！");
					}
					if (!pw.equals(userPo.getPassword())) {
						throw new UnsupportedOperationException("密码错误，请重新输入！");
					}
					request.getSession().setAttribute("user", userPo);//设置用户到session域；
					
				} catch (UnsupportedOperationException e) {
					message = e.getMessage();
					model.addAttribute("message", message);
					return "/login";
				}
			}
		} catch (UnsupportedOperationException e) {
			message = e.getMessage();
			model.addAttribute("message", message);
			return "/login";
		}
		
		return "/index";
	}
}
