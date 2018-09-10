/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.MainPanel;
import ui.MainWindow;

/**
 *
 * @author Aluno
 */
public abstract class Decorator implements IComponent {

    private IComponent myPizza;

    protected Decorator() {
        this.myPizza = null;
    }

    protected Decorator(IComponent decorated) throws Exception {
        setDecorated(decorated);
    }

    public void setDecorated(IComponent decorated) throws Exception {
        this.myPizza = decorated;
    }

    @Override
    public String makePizza() {
        return myPizza.makePizza();
    }

    public static void main(String[] args) {
        loadDecoratorPlugins();
        ArrayList<String> plugins = getloadedPluginsNames();
        m_mainWindow = new MainWindow();
        Dimension size = new Dimension(600, 350);

        m_mainPanel = new MainPanel(loadedDecoratorPlugins);
        m_mainPanel.setPreferredSize(size);
        m_mainPanel.setMinimumSize(size);
        m_mainPanel.setMaximumSize(size);
        m_mainPanel.setSize(size);

        m_mainWindow.setContentPane(m_mainPanel);
        m_mainWindow.setResizable(false);
        m_mainWindow.pack();
        m_mainWindow.setVisible(true);

//        PizzaSimples pizzaSimples = new PizzaSimples();
//        PizzaDecorator pizzaManjericao = new ManjericaoDec();
//        pizzaManjericao.setDecorated(pizzaSimples);
//        System.out.println(pizzaManjericao.decorar());
    }

    private static void loadDecoratorPlugins() {

        loadedDecoratorPlugins = new ArrayList<>();

        
        File currentDir = new File("./plugins");
        ArrayList<String> lPluginsNames = new ArrayList<>();
        for(File file : currentDir.listFiles()){
            if(!file.isDirectory())
                lPluginsNames.add(file.getName());
        }
        URL[] jars = new URL[lPluginsNames.size()];
        URLClassLoader m_ulc;
         for(int i=0;i<lPluginsNames.size();i++){
                    System.out.println(" "+ lPluginsNames.get(i) );
          }
         for(int i=0;i<lPluginsNames.size();i++){
            try {
                URI uri = (new File("./plugins/" + lPluginsNames.get(i))).toURI();
                jars[i] = uri.toURL();
                m_ulc = new URLClassLoader(jars);
                String lName = lPluginsNames.get(i).split("\\.")[0];
                System.out.println(" " + lName);
                loadedDecoratorPlugins.add((Decorator) Class.forName("decorator." + lName, true, m_ulc).newInstance()); 
                //loadedDecoratorPlugins.add((Decorator) Class.forName(lName).newInstance());
            }   
            catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Decorator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
        
        /*
        // Encontra a pasta plugins
        File currentDir = new File("./plugins");
        // Obtem todos os arquivos dentro desta pasta
        String[] plugins = currentDir.list();
        // Criar um array de URL do mesmo tamanho do anterior
        URL[] jars = new URL[plugins.length];
        // Loop para popular o array jars
        for (int i = 0; i < plugins.length; i++) {
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURI().toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(Decorator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         for(int i=0;i<plugins.length;i++){
                    System.out.println(" "+ plugins[i] );
          }
        // Adiciona todos os jars (plugins) no CLASSPATH
        URLClassLoader ulc = new URLClassLoader(jars);
        // Loop para inicialicao dos plugins
        Decorator iplugin = null;
        String pluginName;
        for (String plugin : plugins) {
            if (plugin.endsWith(".java")) {
                System.out.println("entrou");
                pluginName = plugin.split("\\.")[0];
                try {
                    //iplugin = (Decorator) Class.forName("decorator." + pluginName, true, ulc).newInstance();
                    iplugin = (Decorator) Class.forName(pluginName).newInstance();
                    loadedDecoratorPlugins.add(iplugin);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Decorator.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        for (int i = 0; i < loadedDecoratorPlugins.size(); i++) {
            System.out.println("Entrou");
            System.out.println(loadedDecoratorPlugins.get(i));
        }
    }
    */
    }
    public static ArrayList<String> getloadedPluginsNames() {
        ArrayList<String> lPlugins = new ArrayList<String>();
        if (loadedDecoratorPlugins != null) {
            for (Decorator plugin : loadedDecoratorPlugins) {
                lPlugins.add(plugin.getClass().getName().split("\\.")[1]);
            }
        }else{System.out.println("null");}
        return lPlugins;
    }

    private static MainWindow m_mainWindow;
    private static MainPanel m_mainPanel;
    private static ArrayList<Decorator> loadedDecoratorPlugins;
}
